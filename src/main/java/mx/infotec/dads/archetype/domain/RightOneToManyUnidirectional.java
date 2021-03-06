/*
 *  
 * The MIT License (MIT)
 * Copyright (c) 2018 kukulkan
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package mx.infotec.dads.archetype.domain;

import javax.persistence.*;

import java.util.Objects;
import java.io.Serializable;

/**
 * The RightOneToManyUnidirectional
 * 
 * @author kukulkan
 *
 */
@Entity
@Table(name = "right_one_to_many_unidirectional")
public class RightOneToManyUnidirectional implements Serializable {

    private static final long serialVersionUID = 1L;
    
    /**
     * Este campo fue generado automaticamente por kukulkan 
     * Este campo corresponde a la llave primaria id
     *
     * @kukulkanGenerated 20180101000000
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;
	
    	
    @ManyToOne
    @JoinColumn(name = "left_unidirectional_id")
    private LeftUnidirectional leftUnidirectional;
    /**
     * Este método fue generado automaticamente por kukulkan 
     * Este método GETTER fue generado para la llave primaria right_one_to_many_unidirectional.id
     *
     * @return el valor de id
     *
     * @kukulkanGenerated 20180101000000
     */
    public Long getId() {
        return id;
    }

    /**
     * Este método fue generado automaticamente por kukulkan 
     * Este método SETTER fue generado para la llave primaria. right_one_to_many_unidirectional.id
     *
     * @return el valor de id
     *
     * @kukulkanGenerated 20180101000000
     */
    public void setId(Long id) {
        this.id = id;
    }

	    public LeftUnidirectional getLeftUnidirectional() {
        return leftUnidirectional;
    }

    public void setLeftUnidirectional(LeftUnidirectional leftUnidirectional) {
        this.leftUnidirectional = leftUnidirectional;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RightOneToManyUnidirectional rightOneToManyUnidirectional = (RightOneToManyUnidirectional) o;
        if (rightOneToManyUnidirectional.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), rightOneToManyUnidirectional.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
                sb.append("]");
        return sb.toString();
    }
}
